package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
import play.modules.elasticsearch.ElasticSearchable;

@Entity
@ElasticSearchable
public class Sample extends Model {
	
	public String field1;
	
	public String field2;

}

