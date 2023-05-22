package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString

public class ErrorDTO {
    private String error;
    private int status;
    private String path;
    private Object message;
}
