/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE ODOMETRY PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* Odometry message to communicate odometry information with an external interface. Fits ROS REP 147 standard for aerial vehicles (http://www.ros.org/reps/rep-0147.html).
*/
public class msg_odometry extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_ODOMETRY = 331;
    public static final int MAVLINK_MSG_LENGTH = 232;
    private static final long serialVersionUID = MAVLINK_MSG_ID_ODOMETRY;


      
    /**
    * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
    */
    public long time_usec;
      
    /**
    * X Position
    */
    public float x;
      
    /**
    * Y Position
    */
    public float y;
      
    /**
    * Z Position
    */
    public float z;
      
    /**
    * Quaternion components, w, x, y, z (1 0 0 0 is the null-rotation)
    */
    public float q[] = new float[4];
      
    /**
    * X linear speed
    */
    public float vx;
      
    /**
    * Y linear speed
    */
    public float vy;
      
    /**
    * Z linear speed
    */
    public float vz;
      
    /**
    * Roll angular speed
    */
    public float rollspeed;
      
    /**
    * Pitch angular speed
    */
    public float pitchspeed;
      
    /**
    * Yaw angular speed
    */
    public float yawspeed;
      
    /**
    * Row-major representation of a 6x6 pose cross-covariance matrix upper right triangle (states: x, y, z, roll, pitch, yaw; first six entries are the first ROW, next five entries are the second ROW, etc.). If unknown, assign NaN value to first element in the array.
    */
    public float pose_covariance[] = new float[21];
      
    /**
    * Row-major representation of a 6x6 velocity cross-covariance matrix upper right triangle (states: vx, vy, vz, rollspeed, pitchspeed, yawspeed; first six entries are the first ROW, next five entries are the second ROW, etc.). If unknown, assign NaN value to first element in the array.
    */
    public float velocity_covariance[] = new float[21];
      
    /**
    * Coordinate frame of reference for the pose data.
    */
    public short frame_id;
      
    /**
    * Coordinate frame of reference for the velocity in free space (twist) data.
    */
    public short child_frame_id;
      
    /**
    * Estimate reset counter. This should be incremented when the estimate resets in any of the dimensions (position, velocity, attitude, angular speed). This is designed to be used when e.g an external SLAM system detects a loop-closure and the estimate jumps.
    */
    public short reset_counter;
      
    /**
    * Type of estimator that is providing the odometry.
    */
    public short estimator_type;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_ODOMETRY;
              
        packet.payload.putUnsignedLong(time_usec);
              
        packet.payload.putFloat(x);
              
        packet.payload.putFloat(y);
              
        packet.payload.putFloat(z);
              
        
        for (int i = 0; i < q.length; i++) {
            packet.payload.putFloat(q[i]);
        }
                    
              
        packet.payload.putFloat(vx);
              
        packet.payload.putFloat(vy);
              
        packet.payload.putFloat(vz);
              
        packet.payload.putFloat(rollspeed);
              
        packet.payload.putFloat(pitchspeed);
              
        packet.payload.putFloat(yawspeed);
              
        
        for (int i = 0; i < pose_covariance.length; i++) {
            packet.payload.putFloat(pose_covariance[i]);
        }
                    
              
        
        for (int i = 0; i < velocity_covariance.length; i++) {
            packet.payload.putFloat(velocity_covariance[i]);
        }
                    
              
        packet.payload.putUnsignedByte(frame_id);
              
        packet.payload.putUnsignedByte(child_frame_id);
              
        packet.payload.putUnsignedByte(reset_counter);
              
        packet.payload.putUnsignedByte(estimator_type);
        
        return packet;
    }

    /**
    * Decode a odometry message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.time_usec = payload.getUnsignedLong();
              
        this.x = payload.getFloat();
              
        this.y = payload.getFloat();
              
        this.z = payload.getFloat();
              
         
        for (int i = 0; i < this.q.length; i++) {
            this.q[i] = payload.getFloat();
        }
                
              
        this.vx = payload.getFloat();
              
        this.vy = payload.getFloat();
              
        this.vz = payload.getFloat();
              
        this.rollspeed = payload.getFloat();
              
        this.pitchspeed = payload.getFloat();
              
        this.yawspeed = payload.getFloat();
              
         
        for (int i = 0; i < this.pose_covariance.length; i++) {
            this.pose_covariance[i] = payload.getFloat();
        }
                
              
         
        for (int i = 0; i < this.velocity_covariance.length; i++) {
            this.velocity_covariance[i] = payload.getFloat();
        }
                
              
        this.frame_id = payload.getUnsignedByte();
              
        this.child_frame_id = payload.getUnsignedByte();
              
        this.reset_counter = payload.getUnsignedByte();
              
        this.estimator_type = payload.getUnsignedByte();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_odometry(){
        msgid = MAVLINK_MSG_ID_ODOMETRY;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_odometry(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_ODOMETRY;
        unpack(mavLinkPacket.payload);        
    }

                                      
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_ODOMETRY - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" x:"+x+" y:"+y+" z:"+z+" q:"+q+" vx:"+vx+" vy:"+vy+" vz:"+vz+" rollspeed:"+rollspeed+" pitchspeed:"+pitchspeed+" yawspeed:"+yawspeed+" pose_covariance:"+pose_covariance+" velocity_covariance:"+velocity_covariance+" frame_id:"+frame_id+" child_frame_id:"+child_frame_id+" reset_counter:"+reset_counter+" estimator_type:"+estimator_type+"";
    }
}
        