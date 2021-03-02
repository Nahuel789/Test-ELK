package org.acme.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/gelf-logging")
public class GelfLoggingResource {

    private static final Logger LOG = LoggerFactory.getLogger(GelfLoggingResource.class);

    @GET
    public void log() {
        LOG.info("Some useful log message");
    }
}