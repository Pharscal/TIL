package study.server.dto.searched.glycoprotein.identification.chartRowHistogram;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

import java.util.HashMap;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Etd {
	private HashMap<String, List<Id>> id;

	@JsonAnyGetter
	public HashMap<String, List<Id>> getId() {
		return id;
	}
}