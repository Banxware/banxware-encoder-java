package model;

public final class Revenue {
    private final Integer month;
    private final Integer revenueInCents;
    private final String currency;

    Revenue(Integer month, Integer revenueInCents, String currency) {
        this.month = month;
        this.revenueInCents = revenueInCents;
        this.currency = currency;
    }

    public static RevenueBuilder builder() {
        return new RevenueBuilder();
    }

    public Integer getMonth() {
        return this.month;
    }

    public Integer getRevenueInCents() {
        return this.revenueInCents;
    }

    public String getCurrency() {
        return this.currency;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Revenue)) return false;
        final Revenue other = (Revenue) o;
        final Object this$month = this.getMonth();
        final Object other$month = other.getMonth();
        if (this$month == null ? other$month != null : !this$month.equals(other$month)) return false;
        final Object this$revenueInCents = this.getRevenueInCents();
        final Object other$revenueInCents = other.getRevenueInCents();
        if (this$revenueInCents == null ? other$revenueInCents != null : !this$revenueInCents.equals(other$revenueInCents))
            return false;
        final Object this$currency = this.getCurrency();
        final Object other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $month = this.getMonth();
        result = result * PRIME + ($month == null ? 43 : $month.hashCode());
        final Object $revenueInCents = this.getRevenueInCents();
        result = result * PRIME + ($revenueInCents == null ? 43 : $revenueInCents.hashCode());
        final Object $currency = this.getCurrency();
        result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
        return result;
    }

    public String toString() {
        return "Revenue(month=" + this.getMonth() + ", revenueInCents=" + this.getRevenueInCents() + ", currency=" + this.getCurrency() + ")";
    }

    public static class RevenueBuilder {
        private Integer month;
        private Integer revenueInCents;
        private String currency;

        RevenueBuilder() {
        }

        public RevenueBuilder month(Integer month) {
            this.month = month;
            return this;
        }

        public RevenueBuilder revenueInCents(Integer revenueInCents) {
            this.revenueInCents = revenueInCents;
            return this;
        }

        public RevenueBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Revenue build() {
            return new Revenue(month, revenueInCents, currency);
        }

        public String toString() {
            return "Revenue.RevenueBuilder(month=" + this.month + ", revenueInCents=" + this.revenueInCents + ", currency=" + this.currency + ")";
        }
    }
}
