package com.alibaba.griver.bluetooth.ble;

import com.alibaba.griver.api.constants.GriverErrors;

public class ErrorConstants {
    public static final String[] BLUETOOTH_STATE_STR = {"Bluetooth is not enabled", "Lost connection with system service", "Permission is not granted", "Unknown error"};
    public static final String[] ERROR_BEACON_ALREADY_DISCOVERING = {"11004", "Search has started"};
    public static final String[] ERROR_BEACON_BLUETOOTH_UNAVAILABLE = {"11001", "Bluetooth service is unavailable"};
    public static final String[] ERROR_BEACON_INVALID_UUID = {"11006", "UUID format error"};
    public static final String[] ERROR_BEACON_LACK_PARAMS = {"11005", "Lack param"};
    public static final String[] ERROR_BEACON_LOCATION_FORBIDDEN = {"11003", "Location permission is not granted"};
    public static final String[] ERROR_BEACON_LOCATION_UNAVAILABLE = {"11002", "Location service is unavailable"};
    public static final String[] ERROR_BEACON_SYSTEM_ERROR = {"11007", "System error"};
    public static final String[] ERROR_BEACON_UNSUPPORT = {"11000", "Not supported in this device or system"};
    public static final String[] ERROR_BEACON_UUID_EMPTY = {"11008", "Param error, UUID array is empty"};
    public static final String[] ERROR_BLUETOOTHADAPTER_NOT_INITIALIZED = {"10000", "Bluetooth adapter is not initialized"};
    public static final String[] ERROR_BLUETOOTH_UNAVAILABLE = {GriverErrors.ERROR_APPID_EXCEPTION, "Bluetooth unavailable"};
    public static final String[] ERROR_CHARACTERISTICID_INVALID = {"10013", "Invalid characteristic id"};
    public static final String[] ERROR_CHARACTERISTIC_NOT_FOUND = {GriverErrors.ERROR_APP_EXPIRES, "Characteristic not found"};
    public static final String[] ERROR_CHARACTERISTIC_OPERATION_NOT_SUPPORT = {GriverErrors.ERROR_INCREMENTAL_UPDATE, "Characteristic operation not support"};
    public static final String ERROR_CODE = "error";
    public static final String ERROR_CODE_12 = "12";
    public static final String ERROR_CODE_13 = "13";
    public static final String ERROR_CODE_14 = "14";
    public static final String ERROR_CODE_15 = "15";
    public static final String[] ERROR_CODE_ARRAY = {"12", "13", "13", "14", ERROR_CODE_15};
    public static final String[] ERROR_CONNECT_FAIL = {GriverErrors.ERROR_NO_APP_INFO, "Connect fail"};
    public static final String[] ERROR_DESCRIPTOR_NOT_FOUND = {GriverErrors.ERROR_PREPARE_TIMEOUT, "Descriptor not found"};
    public static final String[] ERROR_DEVICEID_INVALID = {GriverErrors.ERROR_LAUNCH_INTERCEPTED, "Invalid device id "};
    public static final String[] ERROR_DEVICE_NOT_FOUND = {GriverErrors.ERROR_UNZIP_FAILED, "Device not found"};
    public static final String[] ERROR_HEX_DATA_ERROR = {GriverErrors.ERROR_APP_PACKAGE_URL_EMPTY, "Data error"};
    public static final String ERROR_MESSAGE = "errorMessage";
    public static final String[] ERROR_MESSAGE_INVALID_PARAM = {"10022", "Invalid param"};
    public static final String[] ERROR_NO_CONNECTION = {GriverErrors.ERROR_VERIFY_APP, "Connection lost"};
    public static final String[] ERROR_PARAM_LACK = {"10016", "Lack params"};
    public static final String[] ERROR_READ_CHARACTERISTIC_FAIL = {"10018", "Read characteristic failed"};
    public static final String[] ERROR_SCAN_GPS_UNAVAILABLE = {"10021", "Location service is unavailable"};
    public static final String[] ERROR_SCAN_INVALID_UUID = {"10020", "UUID format error"};
    public static final String[] ERROR_SCAN_LOCATION_UNAVAILABLE = {"10019", "Location permission is not granted"};
    public static final String[] ERROR_SERVICEID_INVALID = {GriverErrors.ERROR_APPX_VERSION_TOO_LOW, "Invalid service id"};
    public static final String[] ERROR_SERVICE_NOT_FOUND = {GriverErrors.ERROR_LAST_LAUNCH_NOT_END, "Service not found"};
    public static final String[] ERROR_SYSTEM_ERROR = {GriverErrors.ERROR_NO_LOCAL_RESOURCE, "System error"};
    public static final String[] ERROR_TIMEOUT = {GriverErrors.ERROR_APP_EMBEDDED_URL_EMPTY, "Timeout"};
    public static final String[] ERROR_UNSUPPORT_BLE = {GriverErrors.ERROR_DOWNLOAD_FAILED, "Bluetooth 4.0 is not supported"};
    public static final String[] ERROR_WRITE_CHARACTERISTIC_FAIL = {"10017", "Write characteristic failed"};
}
