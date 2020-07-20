/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE EFI_STATUS PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* EFI status output
*/
public class msg_efi_status extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_EFI_STATUS = 225;
    public static final int MAVLINK_MSG_LENGTH = 65;
    private static final long serialVersionUID = MAVLINK_MSG_ID_EFI_STATUS;


      
    /**
    * ECU index
    */
    public float ecu_index;
      
    /**
    * RPM
    */
    public float rpm;
      
    /**
    * Fuel consumed
    */
    public float fuel_consumed;
      
    /**
    * Fuel flow rate
    */
    public float fuel_flow;
      
    /**
    * Engine load
    */
    public float engine_load;
      
    /**
    * Throttle position
    */
    public float throttle_position;
      
    /**
    * Spark dwell time
    */
    public float spark_dwell_time;
      
    /**
    * Barometric pressure
    */
    public float barometric_pressure;
      
    /**
    * Intake manifold pressure(
    */
    public float intake_manifold_pressure;
      
    /**
    * Intake manifold temperature
    */
    public float intake_manifold_temperature;
      
    /**
    * Cylinder head temperature
    */
    public float cylinder_head_temperature;
      
    /**
    * Ignition timing (Crank angle degrees)
    */
    public float ignition_timing;
      
    /**
    * Injection time
    */
    public float injection_time;
      
    /**
    * Exhaust gas temperature
    */
    public float exhaust_gas_temperature;
      
    /**
    * Output throttle
    */
    public float throttle_out;
      
    /**
    * Pressure/temperature compensation
    */
    public float pt_compensation;
      
    /**
    * EFI health status
    */
    public short health;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_EFI_STATUS;
              
        packet.payload.putFloat(ecu_index);
              
        packet.payload.putFloat(rpm);
              
        packet.payload.putFloat(fuel_consumed);
              
        packet.payload.putFloat(fuel_flow);
              
        packet.payload.putFloat(engine_load);
              
        packet.payload.putFloat(throttle_position);
              
        packet.payload.putFloat(spark_dwell_time);
              
        packet.payload.putFloat(barometric_pressure);
              
        packet.payload.putFloat(intake_manifold_pressure);
              
        packet.payload.putFloat(intake_manifold_temperature);
              
        packet.payload.putFloat(cylinder_head_temperature);
              
        packet.payload.putFloat(ignition_timing);
              
        packet.payload.putFloat(injection_time);
              
        packet.payload.putFloat(exhaust_gas_temperature);
              
        packet.payload.putFloat(throttle_out);
              
        packet.payload.putFloat(pt_compensation);
              
        packet.payload.putUnsignedByte(health);
        
        return packet;
    }

    /**
    * Decode a efi_status message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.ecu_index = payload.getFloat();
              
        this.rpm = payload.getFloat();
              
        this.fuel_consumed = payload.getFloat();
              
        this.fuel_flow = payload.getFloat();
              
        this.engine_load = payload.getFloat();
              
        this.throttle_position = payload.getFloat();
              
        this.spark_dwell_time = payload.getFloat();
              
        this.barometric_pressure = payload.getFloat();
              
        this.intake_manifold_pressure = payload.getFloat();
              
        this.intake_manifold_temperature = payload.getFloat();
              
        this.cylinder_head_temperature = payload.getFloat();
              
        this.ignition_timing = payload.getFloat();
              
        this.injection_time = payload.getFloat();
              
        this.exhaust_gas_temperature = payload.getFloat();
              
        this.throttle_out = payload.getFloat();
              
        this.pt_compensation = payload.getFloat();
              
        this.health = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_efi_status(){
        msgid = MAVLINK_MSG_ID_EFI_STATUS;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_efi_status(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_EFI_STATUS;
        unpack(mavLinkPacket.payload);        
    }

                                      
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_EFI_STATUS - sysid:"+sysid+" compid:"+compid+" ecu_index:"+ecu_index+" rpm:"+rpm+" fuel_consumed:"+fuel_consumed+" fuel_flow:"+fuel_flow+" engine_load:"+engine_load+" throttle_position:"+throttle_position+" spark_dwell_time:"+spark_dwell_time+" barometric_pressure:"+barometric_pressure+" intake_manifold_pressure:"+intake_manifold_pressure+" intake_manifold_temperature:"+intake_manifold_temperature+" cylinder_head_temperature:"+cylinder_head_temperature+" ignition_timing:"+ignition_timing+" injection_time:"+injection_time+" exhaust_gas_temperature:"+exhaust_gas_temperature+" throttle_out:"+throttle_out+" pt_compensation:"+pt_compensation+" health:"+health+"";
    }
}
        