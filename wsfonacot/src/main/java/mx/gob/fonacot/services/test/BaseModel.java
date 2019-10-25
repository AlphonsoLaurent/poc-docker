package mx.gob.fonacot.services.test;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class BaseModel {
    protected BaseModel() {
        super();
    }

    @Override
    public String toString() {
        try {
            return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
        } catch (Exception e) {
            return "";
        }
    }
}