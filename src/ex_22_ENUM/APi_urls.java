package ex_22_ENUM;

public enum APi_urls {
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    APi_urls(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }
}
