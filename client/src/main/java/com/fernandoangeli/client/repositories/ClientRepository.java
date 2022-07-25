package com.fernandoangeli.client.repositories;

import com.fernandoangeli.client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
