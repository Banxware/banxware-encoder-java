package com.banxware;

class Message {
    private final String merchantInfo;
    private final String signature;

    Message(String merchantInfo, String signature) {
        this.merchantInfo = merchantInfo;
        this.signature = signature;
    }

    public static MessageBuilder builder() {
        return new MessageBuilder();
    }

    public String getMerchantInfo() {
        return this.merchantInfo;
    }

    public String getSignature() {
        return this.signature;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Message)) return false;
        final Message other = (Message) o;
        final Object this$merchantInfo = this.getMerchantInfo();
        final Object other$merchantInfo = other.getMerchantInfo();
        if (this$merchantInfo == null ? other$merchantInfo != null : !this$merchantInfo.equals(other$merchantInfo))
            return false;
        final Object this$signature = this.getSignature();
        final Object other$signature = other.getSignature();
        if (this$signature == null ? other$signature != null : !this$signature.equals(other$signature)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $merchantInfo = this.getMerchantInfo();
        result = result * PRIME + ($merchantInfo == null ? 43 : $merchantInfo.hashCode());
        final Object $signature = this.getSignature();
        result = result * PRIME + ($signature == null ? 43 : $signature.hashCode());
        return result;
    }

    public String toString() {
        return "com.banxware.Message(merchantInfo=" + this.getMerchantInfo() + ", signature=" + this.getSignature() + ")";
    }

    public static class MessageBuilder {
        private String merchantInfo;
        private String signature;

        MessageBuilder() {
        }

        public MessageBuilder merchantInfo(String merchantInfo) {
            this.merchantInfo = merchantInfo;
            return this;
        }

        public MessageBuilder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public Message build() {
            return new Message(merchantInfo, signature);
        }

        public String toString() {
            return "com.banxware.Message.MessageBuilder(merchantInfo=" + this.merchantInfo + ", signature=" + this.signature + ")";
        }
    }
}
