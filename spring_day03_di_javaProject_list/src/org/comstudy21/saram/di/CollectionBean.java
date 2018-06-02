package org.comstudy21.saram.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.comstudy21.saram.model.Saram;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CollectionBean {
	private List<Saram> saramList;
	private Set<String> saramSet;
	private Map<String, String> saramMap;
	private Properties saramProp;
}
