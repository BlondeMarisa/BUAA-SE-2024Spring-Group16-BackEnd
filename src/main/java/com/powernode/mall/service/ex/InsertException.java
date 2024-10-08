package com.powernode.mall.service.ex;

public class InsertException extends ServiceException
{
    public InsertException()
    {
        super();
    }

    public InsertException(String message)
    {
        super(message);
    }

    public InsertException(String message, Throwable cause)
    {
        super(message, cause);
    }

    protected InsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public InsertException(Throwable cause)
    {
        super(cause);
    }
}
