package org.bsoftware.ward.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * InfoDto is a container for other info objects
 *
 * @author Rudolf Barbu
 * @version 1.0.1
 */
@Getter
@Setter
public class InfoDto
{
    /**
     *  Processor info dto field
     */
    private ProcessorDto processorDto;

    /**
     *  machine info dto field
     */
    private MachineDto machineDto;

    /**
     *  Storage info dto field
     */
    private StorageDto storageDto;

    /**
     *  Uptime info dto field
     */
    private UptimeDto uptimeDto;

    /**
     *  Setup info dto field
     */
    private SetupDto setupDto;

    /**
     *  Maven info dto field
     */
    private MavenDto mavenDto;
}