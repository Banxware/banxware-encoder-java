package dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Message {
    String merchantInfo;
    String signature;
}
