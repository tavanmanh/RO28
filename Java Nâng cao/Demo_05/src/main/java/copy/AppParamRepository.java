package copy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppParamRepository extends JpaRepository<AppParam, Long>, AppParamRepositoryCustom {
    AppParam getByIdAndStatus(Long id, Long status);
    AppParam findByIdAndStatus(Long id, Long status);
    void deleteByIdAndStatus(Long id, Long status);
}
