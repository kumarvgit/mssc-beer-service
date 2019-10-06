package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * We dont need to annotate thi to @Repository since PagingAndSortingRepository already does that
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
