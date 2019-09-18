package app.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
@JacksonXmlRootElement
public class AuthenticatedUser implements Serializable {

    private String username;

    private String password;

    private boolean authenticated;

}
