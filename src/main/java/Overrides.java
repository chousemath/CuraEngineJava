import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Overrides {
    public String machine_name;
    public String machine_shape;
    public String machine_gcode_flavor;
    public String machine_start_gcode;
    public String machine_end_gcode;
    public Boolean machine_heated_bed;
    public Boolean machine_center_is_zero;
    public float machine_width;
    public float machine_depth;
    public float machine_height;
    public float layer_height;
    public float machine_nozzle_size;
    public float material_diameter;
    public float speed_print;
    public float speed_travel;
    public float speed_infill;
    public float speed_wall;
    public float speed_topbottom;
    public float speed_layer_0;
    public float retraction_speed;
    public float retraction_amount;
    public float gantry_height;

    public Overrides(JsonObject overrides) {
        this.machine_name = getString(overrides.get("machine_name"));
        this.machine_shape = getString(overrides.get("machine_shape"));
        this.machine_gcode_flavor = getString(overrides.get("machine_gcode_flavor"));
        this.machine_start_gcode = getString(overrides.get("machine_start_gcode"));
        this.machine_end_gcode = getString(overrides.get("machine_end_gcode"));
    }

    private static String getString(JsonElement element) {
        if (element == null) return "";
        JsonObject jElement = element.getAsJsonObject();
        return jElement.get("default_value").toString();
    }
}
