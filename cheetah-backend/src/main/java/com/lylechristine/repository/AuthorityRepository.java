package com.lylechristine.repository;

import com.lylechristine.model.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Lyle Christine
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
