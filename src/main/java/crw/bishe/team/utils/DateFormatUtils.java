package crw.bishe.team.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description Description 全局日期格式化工具类
 * @Author crw
 * @Date Created in 2020/2/14 0014
 * @Time 21:51
 */
@JsonComponent
public class DateFormatUtils {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");

    public static class DateJsonSerializer extends JsonSerializer<Date> {

        /**
         * 日期格式化
         * @param value
         * @param gen
         * @param serializers
         * @throws IOException
         */
        @Override
        public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString(dateFormat.format(value));
        }
    }

    /**
     * 解析日期字符串
     */
    public static class DateJsonDeserializer extends JsonDeserializer<Date>{

        @Override
        public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            try {
                return dateFormat.parse(p.getText());
            }catch (ParseException e){
                throw new RuntimeException(e);
            }
        }
    }
}
