package mate.academy.springboot.swagger.service;

import org.springframework.data.domain.Sort;

public interface SortService {

    Sort getSort(String sortParameters);
}
