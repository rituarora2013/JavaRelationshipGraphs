package org.jrg.convertor;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;

public class ExtendedJRGConvertor {

	GraphDatabaseService graphDb = null;
	Transaction tx= null;
	
	public ExtendedJRGConvertor(GraphDatabaseService db, Transaction trx)
	{
		graphDb = db;
		tx = trx;
	}
	
	public void createJavaProject ()
	{
		
	}
}
