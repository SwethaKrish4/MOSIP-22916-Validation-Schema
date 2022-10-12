package main;

import com.fasterxml.jackson.databind.ObjectMapper;
import idschema.IdentitySchema;
import uispec.Ui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;

public class SchemaUi {
    public static void main(String[] args) {
        try {
            File uispc, schema;
            if (args.length==0||args.length==1) {
                uispc = new File("ui_spc_latest.json");
                schema = new File("id_schema_latest-eng-ara.json");

            } else {
                uispc = new File(args[0]);
                schema = new File(args[1]);
            }
            ObjectMapper om = new ObjectMapper();
            Ui ui = om.readValue(uispc, Ui.class);
            IdentitySchema is = om.readValue(schema, IdentitySchema.class);
            BufferedWriter writer = new BufferedWriter(new FileWriter("Id_SchemaAndUi_SpecResult.txt"));
            boolean flag;
            Set<String> isObj = is.properties.identity.properties.keySet();
            for (String isKey : isObj) {
                flag = false;
                for (int i = 0; i < ui.identity.identity.size(); i++) {
                    if (isKey.equals(ui.identity.identity.get(i).get("id"))) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    System.out.println(isKey + " doesn't existing in ui_spec \n");
                    writer.write(isKey + " doesn't existing in ui_spec \n");
                }
            }
            writer.close();
    } catch (Exception e){
        e.printStackTrace();
    }
    }
}


