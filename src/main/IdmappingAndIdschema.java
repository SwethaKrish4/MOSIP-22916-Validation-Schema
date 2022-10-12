package main;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import idschema.IdentitySchema;
import idmapping.IdentityMapping;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class IdmappingAndIdschema {
    public static void main(String[] args) {
        try {
            File mapping,schema;
            if(args.length==0|| args.length==1){
                mapping=new File("identity_mapping.json");
                schema=new File("id_schema_latest-eng-ara.json");
            }else {
                mapping = new File(args[0]);
                schema = new File(args[1]);
            }
            ObjectMapper om = new ObjectMapper();
            IdentityMapping im = om.readValue(mapping, IdentityMapping.class);
            IdentitySchema is = om.readValue(schema, IdentitySchema.class);
            BufferedWriter writer = new BufferedWriter(new FileWriter("Id_mapping&Id_schemaResult.txt"));
            boolean flag;
            System.out.println("------------------------identity object--------------------------");
            writer.write("------------------------identity object--------------------------\n");
            Set<String> identityObj = im.identity.keySet();
            for (String idKey : identityObj) {
                int temp=0;
                List<String> fieldList=new ArrayList<String>();
                String[] commaSeparated = im.identity.get(idKey).get("value").split(",");
                for (String commaSeparatedValue : commaSeparated) {
                    flag = false;
                    Set<String> propertiesObj = is.properties.identity.properties.keySet();
                    for (String propertiesKey : propertiesObj) {
                        if (commaSeparatedValue.equals(propertiesKey)) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag == false) {
                        fieldList.add(commaSeparatedValue);
                        temp = 1;
                    }
                }
                if(temp==1){
                    System.out.print("For "+idKey+" in identity_mapping value: ");
                    writer.write("For "+idKey+" in identity_mapping value: ");
                    for (int i=0;i<fieldList.size();i++){
                        System.out.print(fieldList.get(i));
                        writer.write(fieldList.get(i));
                        if(i+1!=fieldList.size()){
                            System.out.print(",");
                            writer.write(",");
                        }
                    }
                    if(fieldList.size()==1) {
                        System.out.print(" is missing from identity_schema \n");
                        writer.write(" is missing from identity_schema \n");
                    }else{
                        System.out.print(" are missing from identity_schema \n");
                        writer.write(" are missing from identity_schema \n");
                    }
                }
            }

            System.out.println("------------------------metaInfo object-------------------------");
            writer.write("------------------------metaInfo object------------------------- \n");
            flag = false;
            Set<String> propertiesObj = is.properties.identity.properties.keySet();
            for (String propertiesKey : propertiesObj) {
                if (im.metaInfo.get("value").contains(propertiesKey)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("For metaInfo in identity_mapping value: " + im.metaInfo.get("value") + " field is missing from identity_schema");
                writer.write("For metaInfo in identity_mapping value: " + im.metaInfo.get("value") + " field is missing from identity_schema \n");
            }

            System.out.println("------------------------audits object--------------------------");
            writer.write("------------------------audits object-------------------------- \n");
            flag = false;
            Set<String> propertiesObj1 = is.properties.identity.properties.keySet();
            for (String propertiesKey : propertiesObj) {
                if (im.audits.get("value").contains(propertiesKey)) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("For audits in identity_mapping value: " + im.audits.get("value") + " field is missing from identity_schema");
                writer.write("For audits in identity_mapping value: " + im.audits.get("value") + " field is missing from identity_schema \n");
            }

            System.out.println("------------------------documents object--------------------------");
            writer.write("------------------------documents object-------------------------- \n");
            Set<String> docObj = im.documents.keySet();
            for (String docKey : docObj) {
                int temp=0;
                List<String> fieldList=new ArrayList<String>();
                String[] commaSeparated = im.documents.get(docKey).get("value").split(",");
                for (String commaSeparatedValue : commaSeparated) {
                    flag = false;
                    Set<String> propertiesObj2 = is.properties.identity.properties.keySet();
                    for (String propertiesKey : propertiesObj2) {
                        if (commaSeparatedValue.equals(propertiesKey)) {
                            flag = true;
                            break;
                        }
                    }
                    if (flag == false) {
                        fieldList.add(commaSeparatedValue);
                        temp = 1;
                    }
                }
                if(temp==1){
                    System.out.print("For "+docKey+" in identity_mapping value: ");
                    writer.write("For "+docKey+" in identity_mapping value: ");
                    for (int i=0;i<fieldList.size();i++){
                        System.out.print(fieldList.get(i));
                        writer.write(fieldList.get(i));
                        if(i+1!=fieldList.size()){
                            System.out.print(",");
                            writer.write(",");
                        }
                    }
                    if(fieldList.size()==1) {
                        System.out.print(" is missing from identity_schema \n");
                        writer.write(" is missing from identity_schema \n");
                    }else{
                        System.out.print(" are missing from identity_schema \n");
                        writer.write(" are missing from identity_schema \n");
                    }

                }
            }
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
