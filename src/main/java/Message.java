import lombok.Builder;
import lombok.Value;

@Value
@Builder
class Message {
    String merchantInfo;
    String signature;
}
