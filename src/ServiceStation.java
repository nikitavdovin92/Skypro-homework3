public class ServiceStation {
    public void check (Car car) {
        checkTransportParameters(car);
            car.checkEngine();
    }

    public void check (Bicycle bicycle) {
        checkTransportParameters(bicycle);
        bicycle.updateTyre();
    }

    public void check (Truck truck) {
        checkTransportParameters(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    private void checkTransportParameters (TransportParameters transportParameters) {
        System.out.println("Обслуживаем " + transportParameters.getModelName());
        for (int i = 0; i < transportParameters.getWheelsCount(); i++) {
            transportParameters.updateTyre();
        }
        transportParameters.updateTyre();
    }
}

