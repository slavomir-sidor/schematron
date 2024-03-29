import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { TranslateModule } from '@ngx-translate/core';
import { UxAllModule } from '@eui/components/legacy';
import { EuiAllModule } from '@eui/components';
import {
	DynamicFormsModule,
	DynConfigService,
	DynFormApiService,
	FormService,
	UxDynFormsComponentModule,
	UxDynMappingConfig
} from '@eui/dynamic-forms';
import { ApiModule } from './api-client/api.module';

import { SXCreateWizardComponent } from './components/create-wizard/index.component';

import { SXDocumentCreateComponent } from './components/document/create/create.component';
import { SXDocumentBrowseComponent } from './components/document/browse/browse.component';
import { SXDocumentDetailComponent } from './components/document/detail/detail.component';
import { SXDocumentEditComponent } from './components/document/edit/edit.component';
import { SXDocumentIndexComponent } from './components/document/index/index.component';
import { SXDocumentSearchComponent } from './components/document/search/search.component';
import { SXDocumentUploadComponent } from './components/document/upload/upload.component';

import { SXFolderBrowseComponent } from './components/folder/browse/browse.component';
import { SXFolderCreateComponent } from './components/folder/create/create.component';
import { SXFolderEditComponent } from './components/folder/edit/edit.component';
import { SXFolderIndexComponent } from './components/folder/index/index.component';
import { SXFolderSearchComponent } from './components/folder/search/search.component';

import { SXHeaderComponent } from './components/header/header.component';

import { SXFormComponent } from './components/form/form.component';

import { SXNamespaceBrowseComponent } from './components/namespace/browse/browse.component';
import { SXNamespaceCreateComponent } from './components/namespace/create/create.component';
import { SXNamespaceDetailComponent } from './components/namespace/detail/detail.component';
import { SXNamespaceEditComponent } from './components/namespace/edit/edit.component';
import { SXNamespaceSearchComponent } from './components/namespace/search/search.component';

import { SxSchemaBrowseComponent } from './components/schema/browse/browse.component';
import { SXSchemaCreateComponent } from './components/schema/create/create.component';
import { SxSchemaEditComponent } from './components/schema/edit/edit.component';
import { SXSchemaIndexComponent } from './components/schema/index/index.component';
import { SxSchemaSearchComponent } from './components/schema/search/search.component';
import { SxSchemaViewComponent } from './components/schema/view/view.component';

import { SXSpaceBrowseComponent } from './components/space/browse/browse.component';
import { SXSpaceIndexComponent } from './components/space/index/index.component';
import { SXSpaceDetailComponent } from './components/space/detail/detail.component';

import { SXUploadComponent } from './components/upload/upload.component';

import { LocalStorageService } from './services/local-storage.service';
import { SXSpaceCreateComponent } from './components/space/create/create.component';


export const dynMapDefault: UxDynMappingConfig = {
	rulesMap: {
		// customRule: customRule,
	},
	validationsMap: {
		// customVal: customVal,
	},
	valMessagesMap: {
		// customValMessageMap: customValMessageMap,
	},
};

@NgModule({
	imports: [
		CommonModule,
		FormsModule,
		ReactiveFormsModule,
		RouterModule,
		UxAllModule,
		EuiAllModule,
		TranslateModule,
		DynamicFormsModule,
		UxDynFormsComponentModule,
		ApiModule,
		DynamicFormsModule.forRoot(dynMapDefault),
	],

	declarations: [
		SXCreateWizardComponent,

		SXDocumentBrowseComponent,
		SXDocumentCreateComponent,
		SXDocumentDetailComponent,
		SXDocumentEditComponent,
		SXDocumentIndexComponent,
		SXDocumentSearchComponent,
		SXDocumentUploadComponent,

		SXFolderCreateComponent,
		SXFolderBrowseComponent,
		SXFolderEditComponent,
		SXFolderIndexComponent,
		SXFolderSearchComponent,

		SXHeaderComponent,
		SXFormComponent,

		SXNamespaceBrowseComponent,
		SXNamespaceCreateComponent,
		SXNamespaceDetailComponent,
		SXNamespaceEditComponent,
		SXNamespaceSearchComponent,

		SxSchemaBrowseComponent,
		SXSchemaCreateComponent,
		SxSchemaEditComponent,
		SXSchemaIndexComponent,
		SxSchemaSearchComponent,
		SxSchemaViewComponent,

		SXSpaceBrowseComponent,
		SXSpaceCreateComponent,
		SXSpaceDetailComponent,
		SXSpaceIndexComponent,

		SXUploadComponent,
	],

	exports: [
		CommonModule,
		FormsModule,
		ReactiveFormsModule,
		RouterModule,
		UxAllModule,
		EuiAllModule,
		TranslateModule,
		DynamicFormsModule,
		UxDynFormsComponentModule,
		ApiModule,

		SXCreateWizardComponent,

		SXDocumentBrowseComponent,
		SXDocumentCreateComponent,
		SXDocumentDetailComponent,
		SXDocumentEditComponent,
		SXDocumentIndexComponent,
		SXDocumentSearchComponent,
		SXDocumentUploadComponent,

		SXFolderBrowseComponent,
		SXFolderCreateComponent,
		SXFolderEditComponent,
		SXFolderSearchComponent,

		SXHeaderComponent,
		SXFormComponent,

		SXNamespaceBrowseComponent,
		SXNamespaceCreateComponent,
		SXNamespaceDetailComponent,
		SXNamespaceEditComponent,
		SXNamespaceSearchComponent,

		SxSchemaBrowseComponent,
		SXSchemaCreateComponent,
		SxSchemaEditComponent,
		SXSchemaIndexComponent,
		SxSchemaSearchComponent,
		SxSchemaViewComponent,

		SXSpaceBrowseComponent,
		SXSpaceCreateComponent,
		SXSpaceDetailComponent,
		SXSpaceIndexComponent,

		SXUploadComponent
	],

	providers: [
		DynConfigService,
		FormService,
		DynFormApiService,
		LocalStorageService,
	],
})
export class SharedModule { }
