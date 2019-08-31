package myapp.responses;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Response {
    private String status;

    public Response(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
