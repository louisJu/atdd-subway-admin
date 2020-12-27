package nextstep.subway.section.domain;

import nextstep.subway.line.domain.Line;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SectionRepository extends JpaRepository<Section, Long> {

    List<Section> findByLine(Line line);
}
