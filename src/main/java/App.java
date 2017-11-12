public class App {
    public static void main(String[] args) {
        String filePath = "/Users/jo/IdeaProjects/CuraEngineParser/src/test/json/overrides1.json";
        Parser parsedFile = new Parser(filePath);
        System.out.println(parsedFile.printerDefinition.overrides);
        System.out.println(parsedFile.curaObject.machine_name);
        System.out.println(parsedFile.curaObject.machine_shape);
        System.out.println(parsedFile.curaObject.machine_gcode_flavor);
        System.out.println(parsedFile.curaObject.machine_start_gcode);
        System.out.println(parsedFile.curaObject.machine_end_gcode);
    }
}
