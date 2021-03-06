/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bonsai.simulatorapi.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SimulatorSession model, having details of one active simulator session.
 * When a simulator registers, it creates and starts active simulator session.
 * When that simulator deregisters itself, it ends and removes its simulator
 * session.
 * If the Bonsai platform deregisters a simulator due to that simulator's
 * "misbehavior,"
 * that also ends and removes that simulator's session.
 */
public class SimulatorSessionResponse {
    /**
     * Unique sessionId for this simulator session.
     */
    @JsonProperty(value = "sessionId", required = true)
    private String sessionId;

    /**
     * Possible values include: 'Deregistered', 'Attachable', 'Attached',
     * 'Detaching', 'Rejected'.
     */
    @JsonProperty(value = "sessionStatus")
    private SimulatorSessionTypesStatus sessionStatus;

    /**
     * The sessionProgress property.
     */
    @JsonProperty(value = "sessionProgress")
    private SimulatorSessionProgress sessionProgress;

    /**
     * The interfaceProperty property.
     */
    @JsonProperty(value = "interface")
    private SimulatorInterface interfaceProperty;

    /**
     * The simulatorContext property.
     */
    @JsonProperty(value = "simulatorContext")
    private SimulatorContext simulatorContext;

    /**
     * Time when this session was registered with Bonsai platform.
     */
    @JsonProperty(value = "registrationTime", required = true)
    private DateTime registrationTime;

    /**
     * A recent time that this simulator communicated with the Bonsai platform.
     * This value is updated at a regular interval, so it may not be the most
     * recent communication time.
     */
    @JsonProperty(value = "lastSeenTime", required = true)
    private DateTime lastSeenTime;

    /**
     * A recent time that this simulator received an EpisodeStep from the
     * Scholar.
     * This value is updated at a regular interval, so it may not be the most
     * recent communication time.
     */
    @JsonProperty(value = "lastIteratedTime", required = true)
    private DateTime lastIteratedTime;

    /**
     * Current IterationRate, 1 state-action loop is roughly maps to 1
     * iteration.
     */
    @JsonProperty(value = "iterationRate")
    private Double iterationRate;

    /**
     * Additional Details for this session provided by Bonsai platform.
     */
    @JsonProperty(value = "details")
    private String details;

    /**
     * Get unique sessionId for this simulator session.
     *
     * @return the sessionId value
     */
    public String sessionId() {
        return this.sessionId;
    }

    /**
     * Set unique sessionId for this simulator session.
     *
     * @param sessionId the sessionId value to set
     * @return the SimulatorSessionResponse object itself.
     */
    public SimulatorSessionResponse withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get possible values include: 'Deregistered', 'Attachable', 'Attached', 'Detaching', 'Rejected'.
     *
     * @return the sessionStatus value
     */
    public SimulatorSessionTypesStatus sessionStatus() {
        return this.sessionStatus;
    }

    /**
     * Set possible values include: 'Deregistered', 'Attachable', 'Attached', 'Detaching', 'Rejected'.
     *
     * @param sessionStatus the sessionStatus value to set
     * @return the SimulatorSessionResponse object itself.
     */
    public SimulatorSessionResponse withSessionStatus(SimulatorSessionTypesStatus sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }

    /**
     * Get the sessionProgress value.
     *
     * @return the sessionProgress value
     */
    public SimulatorSessionProgress sessionProgress() {
        return this.sessionProgress;
    }

    /**
     * Set the sessionProgress value.
     *
     * @param sessionProgress the sessionProgress value to set
     * @return the SimulatorSessionResponse object itself.
     */
    public SimulatorSessionResponse withSessionProgress(SimulatorSessionProgress sessionProgress) {
        this.sessionProgress = sessionProgress;
        return this;
    }

    /**
     * Get the interfaceProperty value.
     *
     * @return the interfaceProperty value
     */
    public SimulatorInterface interfaceProperty() {
        return this.interfaceProperty;
    }

    /**
     * Set the interfaceProperty value.
     *
     * @param interfaceProperty the interfaceProperty value to set
     * @return the SimulatorSessionResponse object itself.
     */
    public SimulatorSessionResponse withInterfaceProperty(SimulatorInterface interfaceProperty) {
        this.interfaceProperty = interfaceProperty;
        return this;
    }

    /**
     * Get the simulatorContext value.
     *
     * @return the simulatorContext value
     */
    public SimulatorContext simulatorContext() {
        return this.simulatorContext;
    }

    /**
     * Set the simulatorContext value.
     *
     * @param simulatorContext the simulatorContext value to set
     * @return the SimulatorSessionResponse object itself.
     */
    public SimulatorSessionResponse withSimulatorContext(SimulatorContext simulatorContext) {
        this.simulatorContext = simulatorContext;
        return this;
    }

    /**
     * Get time when this session was registered with Bonsai platform.
     *
     * @return the registrationTime value
     */
    public DateTime registrationTime() {
        return this.registrationTime;
    }

    /**
     * Set time when this session was registered with Bonsai platform.
     *
     * @param registrationTime the registrationTime value to set
     * @return the SimulatorSessionResponse object itself.
     */
    public SimulatorSessionResponse withRegistrationTime(DateTime registrationTime) {
        this.registrationTime = registrationTime;
        return this;
    }

    /**
     * Get a recent time that this simulator communicated with the Bonsai platform.
     This value is updated at a regular interval, so it may not be the most recent communication time.
     *
     * @return the lastSeenTime value
     */
    public DateTime lastSeenTime() {
        return this.lastSeenTime;
    }

    /**
     * Set a recent time that this simulator communicated with the Bonsai platform.
     This value is updated at a regular interval, so it may not be the most recent communication time.
     *
     * @param lastSeenTime the lastSeenTime value to set
     * @return the SimulatorSessionResponse object itself.
     */
    public SimulatorSessionResponse withLastSeenTime(DateTime lastSeenTime) {
        this.lastSeenTime = lastSeenTime;
        return this;
    }

    /**
     * Get a recent time that this simulator received an EpisodeStep from the Scholar.
     This value is updated at a regular interval, so it may not be the most recent communication time.
     *
     * @return the lastIteratedTime value
     */
    public DateTime lastIteratedTime() {
        return this.lastIteratedTime;
    }

    /**
     * Set a recent time that this simulator received an EpisodeStep from the Scholar.
     This value is updated at a regular interval, so it may not be the most recent communication time.
     *
     * @param lastIteratedTime the lastIteratedTime value to set
     * @return the SimulatorSessionResponse object itself.
     */
    public SimulatorSessionResponse withLastIteratedTime(DateTime lastIteratedTime) {
        this.lastIteratedTime = lastIteratedTime;
        return this;
    }

    /**
     * Get current IterationRate, 1 state-action loop is roughly maps to 1 iteration.
     *
     * @return the iterationRate value
     */
    public Double iterationRate() {
        return this.iterationRate;
    }

    /**
     * Set current IterationRate, 1 state-action loop is roughly maps to 1 iteration.
     *
     * @param iterationRate the iterationRate value to set
     * @return the SimulatorSessionResponse object itself.
     */
    public SimulatorSessionResponse withIterationRate(Double iterationRate) {
        this.iterationRate = iterationRate;
        return this;
    }

    /**
     * Get additional Details for this session provided by Bonsai platform.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

    /**
     * Set additional Details for this session provided by Bonsai platform.
     *
     * @param details the details value to set
     * @return the SimulatorSessionResponse object itself.
     */
    public SimulatorSessionResponse withDetails(String details) {
        this.details = details;
        return this;
    }

}
