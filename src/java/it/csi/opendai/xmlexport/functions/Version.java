// $Id: Version.java,v 1.1 2013/07/26 13:14:09 pfvallosio Exp $

package it.csi.opendai.xmlexport.functions;

import it.csi.airquality.aqa.x100.VersionDocument;
import it.csi.opendai.xmlexport.ExportCfgItem;
import it.csi.opendai.xmlexport.XmlExport;

import java.util.Map;

import org.apache.xmlbeans.XmlObject;

public class Version extends Function {

	private ExportCfgItem expConfig;

	public Version(String functionName, boolean useChildId,
			ExportCfgItem expConfig) {
		super(functionName, useChildId);
		this.expConfig = expConfig;
	}

	@Override
	protected XmlObject makeXmlDocument(String childId,
			Map<String, String[]> mapParams) throws Exception {
		VersionDocument doc = VersionDocument.Factory.newInstance();
		it.csi.airquality.aqa.x100.VersionDocument.Version version = doc
				.addNewVersion();
		addSchemaLocation(version, XmlExport.ANAGRAPHIC_SCHEMA_NAMESPACE + " "
				+ expConfig.getAnagraphicSchemaUri());
		version.setMajor(XmlExport.APP_VERSION_MAJOR);
		version.setMinor(XmlExport.APP_VERSION_MINOR);
		version.setBugfix(XmlExport.APP_VERSION_BUGFIX);
		return doc;
	}

}
