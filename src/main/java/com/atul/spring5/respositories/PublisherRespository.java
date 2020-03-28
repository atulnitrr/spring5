package com.atul.spring5.respositories;

import com.atul.spring5.entity.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRespository extends CrudRepository<Publisher, Long> {
}
