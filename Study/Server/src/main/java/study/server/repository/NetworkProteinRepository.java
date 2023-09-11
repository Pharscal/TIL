package study.server.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Repository;
import study.server.dto.network.common.NodeData;
import study.server.dto.network.common.Nodes;
import study.server.dto.network.protein.correlated.chartFolderCytoscape.CCFCytoscapeDTO;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NetworkProteinRepository {
	public CCFCytoscapeDTO getCCFCytoscapeDTO() throws JsonProcessingException {
		List<Nodes> nodeData = new ArrayList<>();
		NodeData data = NodeData.builder().
				id("Psmd7").
				foldChange(0.68).
				name("Psmd7").
				weight(0.0).
				color("#FFB8B8").
				protein("sp|P26516|PSMD7_MOUSE").
				build();
		Nodes nod = Nodes.builder().
				data(data).
				build();
		nodeData.add(nod);
		CCFCytoscapeDTO inst =
				CCFCytoscapeDTO.builder()
						.nodes(nodeData).build();

		return inst;
	}
}