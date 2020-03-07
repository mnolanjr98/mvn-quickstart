package ${package}.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.trustmarkbenefits.vb.sampleapi.api.resource.MyNounResource;

import ${package}.api.resource.${MainResource}Resource;

@RestController
public class ${MainResource}Controller {

	private static final Log LOGGER = LogFactory.getLog(${MainResource}Controller.class);
	
	@RequestMapping(path = "/${ServiceVersion}/${MainResourcePath}", produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<List<${MainResource}Resource>> getAll() {
		LOGGER.info("Fetching All ${MainResource} resources");
		return ResponseEntity.ok(new ArrayList<${MainResource}Resource>());
	}
	
	@RequestMapping(path = "/${ServiceVersion}/${MainResourcePath}/{id}", produces = "application/json", method = RequestMethod.GET)
	public ResponseEntity<${MainResource}Resource> getById(@PathVariable(name = "id") final String id) {
		LOGGER.info("Fetching MyNoun resource by ID");
		
		final ${MainResource}Resource nounResource = new ${MainResource}Resource();
		nounResource.setId(id);
		
		return ResponseEntity.ok(nounResource);
	}
}