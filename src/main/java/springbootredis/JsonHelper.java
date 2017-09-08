/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springbootredis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author sihai
 */
public class JsonHelper {

    public static String obj2json(Object obj) {
        ObjectMapper om = new ObjectMapper();
        //om.readValue(content, User.class);
        String ret = null;
        try {
            ret = om.writeValueAsString(obj);
        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
        return ret;
    }
    //
    //    String obj2json(User obj) throws IOException {
    //        try (Writer w = new StringWriter()) {
    //            JsonWriter jw = Json.createWriter(w);
    //            //JsonGenerator g = ;
    //            JsonObjectBuilder b = Json.createObjectBuilder();
    //            b.add("name", )
    //        }
    //    }
    
}
