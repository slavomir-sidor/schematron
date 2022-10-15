import { Component, OnDestroy, OnInit } from '@angular/core';
import { Store } from '@ngrx/store';
import {
	getUserState,
	UserState,
} from '@eui/core';
import { Observable, Subscription } from 'rxjs';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html',
})
export class AppComponent implements OnInit, OnDestroy {

	userInfos: UserState;

	userState: Observable<UserState>;

	subs: Subscription[] = [];

	toolbarMenuItems = [
		{
			label: 'Dashboard',
			url: '',
			iconClass: ''
		},
		{
			label: 'Documents',
			url: 'folder',
			iconClass: ''
		},
		{
			label: 'Jobs',
			url: 'workflow',
			iconClass: ''
		},
		{
			label: 'eUI',
			url: 'template',
			iconClass: ''
		},
	];

	notificationItems = [
		{ label: 'Title label 1', subLabel: 'Subtitle label' },
		{ label: 'Title label 2', subLabel: 'Subtitle label' },
		{ label: 'Title label 3', subLabel: 'Subtitle label' },
		{ label: 'Title label 4', subLabel: 'Subtitle label' },
	];

	constructor(
		private store: Store<any>
	) {
		this.userState = this.store.select(getUserState);
		this.subs.push(this.userState.subscribe((user: UserState) => {
			this.userInfos = { ...user };
		}));
	}

	ngOnInit() {
	}

	ngOnDestroy() {
		this.subs.forEach((s: Subscription) => s.unsubscribe());
	}
}
