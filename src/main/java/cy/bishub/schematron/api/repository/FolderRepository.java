package cy.bishub.schematron.api.repository;

import cy.bishub.schematron.api.model.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
* Generated by Spring Data Generator on 16/10/2022
*/
@Repository
public interface FolderRepository extends JpaRepository<Folder, Long>, JpaSpecificationExecutor<Folder> {

}
