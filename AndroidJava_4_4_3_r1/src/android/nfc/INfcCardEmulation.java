/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/nfc/INfcCardEmulation.aidl
 */
package android.nfc;
/**
 * @hide
 */
public interface INfcCardEmulation extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.nfc.INfcCardEmulation
{
private static final java.lang.String DESCRIPTOR = "android.nfc.INfcCardEmulation";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.nfc.INfcCardEmulation interface,
 * generating a proxy if needed.
 */
public static android.nfc.INfcCardEmulation asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.nfc.INfcCardEmulation))) {
return ((android.nfc.INfcCardEmulation)iin);
}
return new android.nfc.INfcCardEmulation.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_isDefaultServiceForCategory:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.isDefaultServiceForCategory(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDefaultServiceForAid:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.isDefaultServiceForAid(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setDefaultServiceForCategory:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.setDefaultServiceForCategory(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setDefaultForNextTap:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.setDefaultForNextTap(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getServices:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.util.List<android.nfc.cardemulation.ApduServiceInfo> _result = this.getServices(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.nfc.INfcCardEmulation
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public boolean isDefaultServiceForCategory(int userHandle, android.content.ComponentName service, java.lang.String category) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
if ((service!=null)) {
_data.writeInt(1);
service.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(category);
mRemote.transact(Stub.TRANSACTION_isDefaultServiceForCategory, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isDefaultServiceForAid(int userHandle, android.content.ComponentName service, java.lang.String aid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
if ((service!=null)) {
_data.writeInt(1);
service.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(aid);
mRemote.transact(Stub.TRANSACTION_isDefaultServiceForAid, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setDefaultServiceForCategory(int userHandle, android.content.ComponentName service, java.lang.String category) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
if ((service!=null)) {
_data.writeInt(1);
service.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(category);
mRemote.transact(Stub.TRANSACTION_setDefaultServiceForCategory, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean setDefaultForNextTap(int userHandle, android.content.ComponentName service) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
if ((service!=null)) {
_data.writeInt(1);
service.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setDefaultForNextTap, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.nfc.cardemulation.ApduServiceInfo> getServices(int userHandle, java.lang.String category) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.nfc.cardemulation.ApduServiceInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userHandle);
_data.writeString(category);
mRemote.transact(Stub.TRANSACTION_getServices, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.nfc.cardemulation.ApduServiceInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_isDefaultServiceForCategory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_isDefaultServiceForAid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setDefaultServiceForCategory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setDefaultForNextTap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public boolean isDefaultServiceForCategory(int userHandle, android.content.ComponentName service, java.lang.String category) throws android.os.RemoteException;
public boolean isDefaultServiceForAid(int userHandle, android.content.ComponentName service, java.lang.String aid) throws android.os.RemoteException;
public boolean setDefaultServiceForCategory(int userHandle, android.content.ComponentName service, java.lang.String category) throws android.os.RemoteException;
public boolean setDefaultForNextTap(int userHandle, android.content.ComponentName service) throws android.os.RemoteException;
public java.util.List<android.nfc.cardemulation.ApduServiceInfo> getServices(int userHandle, java.lang.String category) throws android.os.RemoteException;
}
