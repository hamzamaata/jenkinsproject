package net.meryem.client.repository;

import net.meryem.client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> { }

