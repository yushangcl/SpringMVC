package win.likie.mvc.exception;

import java.text.MessageFormat;

/**
 * <p>
 * Description: Service exception 基类,所有Service实现类异常均由此类派生
 * </p>
 *
 * @version 1.0
 */
public class ServiceException extends RuntimeException {
    private int code;

    public ServiceException() {
        super();
    }

    public ServiceException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ServiceException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public ServiceException(int code, String message, Object... params) {
        super(MessageFormat.format(message, params));
        this.code = code;
    }

    public ServiceException(int code, String message, Throwable cause, Object... params) {
        super(MessageFormat.format(message, params), cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}