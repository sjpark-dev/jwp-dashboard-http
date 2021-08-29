package nextstep.jwp.handler;

import nextstep.jwp.model.FileType;
import nextstep.jwp.model.Request;
import nextstep.jwp.model.Response;

public class BaseHandler extends AbstractHandler {

    public static final String BASE_RESPONSE_BODY = "Hello world!";

    public BaseHandler(Request request) {
        super(request);
    }

    @Override
    public Response getMessage() {
        return new Response(staticFileMessage(FileType.HTML, BASE_RESPONSE_BODY));
    }
}
