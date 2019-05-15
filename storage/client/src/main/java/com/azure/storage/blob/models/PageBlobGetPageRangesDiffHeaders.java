// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for GetPageRangesDiff operation.
 */
@JacksonXmlRootElement(localName = "PageBlob-GetPageRangesDiff-Headers")
public final class PageBlobGetPageRangesDiffHeaders {
    /**
     * Returns the date and time the container was last modified. Any operation
     * that modifies the blob, including an update of the blob's metadata or
     * properties, changes the last-modified time of the blob.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /**
     * The ETag contains a value that you can use to perform operations
     * conditionally. If the request version is 2011-08-18 or newer, the ETag
     * value will be in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * The size of the blob in bytes.
     */
    @JsonProperty(value = "x-ms-blob-content-length")
    private Long blobContentLength;

    /**
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /**
     * Indicates the version of the Blob service used to execute the request.
     * This header is returned for requests made against version 2009-09-19 and
     * above.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /**
     * UTC date/time value generated by the service that indicates the time at
     * which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /**
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the lastModified property: Returns the date and time the container
     * was last modified. Any operation that modifies the blob, including an
     * update of the blob's metadata or properties, changes the last-modified
     * time of the blob.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.dateTime();
    }

    /**
     * Set the lastModified property: Returns the date and time the container
     * was last modified. Any operation that modifies the blob, including an
     * update of the blob's metadata or properties, changes the last-modified
     * time of the blob.
     *
     * @param lastModified the lastModified value to set.
     * @return the PageBlobGetPageRangesDiffHeaders object itself.
     */
    public PageBlobGetPageRangesDiffHeaders withLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally. If the request version is 2011-08-18
     * or newer, the ETag value will be in quotes.
     *
     * @return the eTag value.
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally. If the request version is 2011-08-18
     * or newer, the ETag value will be in quotes.
     *
     * @param eTag the eTag value to set.
     * @return the PageBlobGetPageRangesDiffHeaders object itself.
     */
    public PageBlobGetPageRangesDiffHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the blobContentLength property: The size of the blob in bytes.
     *
     * @return the blobContentLength value.
     */
    public Long blobContentLength() {
        return this.blobContentLength;
    }

    /**
     * Set the blobContentLength property: The size of the blob in bytes.
     *
     * @param blobContentLength the blobContentLength value to set.
     * @return the PageBlobGetPageRangesDiffHeaders object itself.
     */
    public PageBlobGetPageRangesDiffHeaders withBlobContentLength(Long blobContentLength) {
        this.blobContentLength = blobContentLength;
        return this;
    }

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the PageBlobGetPageRangesDiffHeaders object itself.
     */
    public PageBlobGetPageRangesDiffHeaders withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the Blob service used
     * to execute the request. This header is returned for requests made
     * against version 2009-09-19 and above.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the Blob service used
     * to execute the request. This header is returned for requests made
     * against version 2009-09-19 and above.
     *
     * @param version the version value to set.
     * @return the PageBlobGetPageRangesDiffHeaders object itself.
     */
    public PageBlobGetPageRangesDiffHeaders withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty property: UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime dateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.dateTime();
    }

    /**
     * Set the dateProperty property: UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the PageBlobGetPageRangesDiffHeaders object itself.
     */
    public PageBlobGetPageRangesDiffHeaders withDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the PageBlobGetPageRangesDiffHeaders object itself.
     */
    public PageBlobGetPageRangesDiffHeaders withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
