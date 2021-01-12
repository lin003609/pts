package bean;

public class Flight
{
    private String id;
    private String planeType;//飞机类型
    private String seatsNo;//座位号
    private String totalSeatsNum;//总座位数
    private String departureAirPort;//出发机场
    private String destinationAirPort;//目的机场
    private String departureData;//出发时间

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPlaneType() { return planeType; }
    public void setPlaneType(String planeType) { this.planeType = planeType; }

    public String getSeatsNo() { return seatsNo; }
    public void setSeatsNo(String seatsNo) { this.seatsNo = seatsNo; }

    public String getTotalSeatsNum() { return totalSeatsNum; }
    public void setTotalSeatsNum(String totalSeatsNum) { this.totalSeatsNum = totalSeatsNum; }

    public String getDepartureAirPort() { return departureAirPort; }
    public void setDepartureAirPort(String departureAirPort) { this.departureAirPort = departureAirPort; }

    public String getDestinationAirPort() { return destinationAirPort; }
    public void setDestinationAirPort(String destinationAirPort) { this.destinationAirPort = destinationAirPort; }

    public String getDepartureData() { return departureData; }
    public void setDepartureData(String departureData) { this.departureData = departureData; }
}
