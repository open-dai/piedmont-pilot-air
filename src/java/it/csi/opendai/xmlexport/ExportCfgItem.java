// $Id: ExportCfgItem.java,v 1.2 2013/07/26 13:14:09 pfvallosio Exp $

package it.csi.opendai.xmlexport;

import it.csi.util.config.Parameter;
import it.csi.util.config.ParametricConfigItem;

public class ExportCfgItem extends ParametricConfigItem {

	private static final long serialVersionUID = -2842203066657154655L;

	private static final int public_stations = 0;
	private static final int public_managed_private_stations = 1;
	private static final int private_stations = 2;
	private static final int chemical_sensors = 3;
	private static final int meteo_sensors = 4;
	private static final int aux_sensors = 5;
	private static final int only_national_stations = 6;
	private static final int only_national_sensors = 7;
	private static final int anagraphic_schema_uri = 8;
	private static final int max_data_per_request = 9;

	private static final Parameter parameters[] = {
			new Parameter("public stations", TYPE_BOOLEAN),
			new Parameter("public managed private stations", TYPE_BOOLEAN),
			new Parameter("private stations", TYPE_BOOLEAN),
			new Parameter("chemical sensors", TYPE_BOOLEAN),
			new Parameter("meteo sensors", TYPE_BOOLEAN),
			new Parameter("aux sensors", TYPE_BOOLEAN),
			new Parameter("only national stations", TYPE_BOOLEAN),
			new Parameter("only national sensors", TYPE_BOOLEAN),
			new Parameter("anagraphic schema uri", TYPE_STRING),
			new Parameter("max data per request", TYPE_INTEGER) };

	public ExportCfgItem() {
		super(parameters);
	}

	public boolean getPublicStations() {
		return (Boolean) getValue(public_stations);
	}

	public boolean getPublicManagedPrivateStations() {
		return (Boolean) getValue(public_managed_private_stations);
	}

	public boolean getPrivateStations() {
		return (Boolean) getValue(private_stations);
	}

	public boolean getChemicalSensors() {
		return (Boolean) getValue(chemical_sensors);
	}

	public boolean getMeteoSensors() {
		return (Boolean) getValue(meteo_sensors);
	}

	public boolean getAuxSensors() {
		return (Boolean) getValue(aux_sensors);
	}

	public boolean getOnlyNationalStations() {
		return (Boolean) getValue(only_national_stations);
	}

	public boolean getOnlyNationalSensors() {
		return (Boolean) getValue(only_national_sensors);
	}

	public String getAnagraphicSchemaUri() {
		return (String) getValue(anagraphic_schema_uri);
	}

	public int getMaxDataPerRequest() {
		return (Integer) getValue(max_data_per_request);
	}

}
