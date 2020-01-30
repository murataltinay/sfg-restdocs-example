package guru.springframework.sfgrestdocsexample.repositories;

import guru.springframework.sfgrestdocsexample.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by jt on 2020-01-30.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
