package fr.tezea.chantiers.repository.chantier;

import fr.tezea.chantiers.domain.chantier.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends MongoRepository<Document, Long>
{
}
