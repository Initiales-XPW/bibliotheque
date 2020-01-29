package com.bpi.bibliotheque.repository;

import com.bpi.bibliotheque.domaine.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping(path = "/libraries")
public interface LibraryRepository extends JpaRepository<Library,Long> {
}
