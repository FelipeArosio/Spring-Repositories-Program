package co.develhope.Spring_Repositories_Program.repositories;

import co.develhope.Spring_Repositories_Program.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "progLanguages", path = "repo-prog-languages")
public interface ProgrammingLanguageRepository extends JpaRepository <ProgrammingLanguage, Long> {
}
