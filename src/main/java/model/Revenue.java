package model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Revenue {
    Integer month;
    Integer revenueInCents;
    String currency;
}
