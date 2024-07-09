import io.javalin.Javalin;

import java.util.List;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        Javalin api = Javalin.create().start(8080);

        //simple ping test
        api.get("/ping", (ctx) -> {
            ctx.status(200);
            ctx.result("Pong!");
        });


        //path param test
        api.get("/user/{username}",
            (ctx) -> {
                ctx.status(200);
                System.out.println("username from path param: " + ctx.pathParam("username"));
            }
        );

        //path param test 2
        api.get("/user/{username}/test2",
            (ctx) -> {
                ctx.status(200);
                String username = ctx.pathParam("username");
                System.out.println("username from path param: " + username);
                ctx.result("welcome, " + username);
            }
        );

        //headers test
        api.get("/headers-test",
            (ctx)->{
                String contentType = ctx.header("Content-Type");
                Map<String, String> headers = ctx.headerMap();
                for(String key : headers.keySet()) {
                    System.out.println("[" + key + "]: " + headers.get(key));
                }
            }
        );


        //query params test
        api.get("/query-params",//www.site.com/something?key1=value1&key2=value2;
            (ctx)->{
                ctx.status(200);
                String username = ctx.queryParam("username");
            }
        );

        api.get("/query-params-print",
                (ctx)->{
                    ctx.status(200);
                    Map<String, List<String>> queryParams = ctx.queryParamMap();
                    for(String key : queryParams.keySet()) {
                        System.out.println("[" + key + "]: " + queryParams.get(key));
                    }
                }
        );
    }
}
