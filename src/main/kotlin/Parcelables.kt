import android.os.Parcel
import android.os.Parcelable

data class ParcelableImplClass(
    val name : String,
    val id : Int
) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readInt()
    ) {
    }

    override fun describeContents(): Int = 0

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeInt(id)
    }

    //optional override toString for simple class, while data class has its own toString() implementation
    override fun toString(): String {
        return "ParcelableImplClass(name = $name, id = $id)"
    }

    companion object CREATOR : Parcelable.Creator<ParcelableImplClass> {
        override fun createFromParcel(parcel: Parcel): ParcelableImplClass {
            return ParcelableImplClass(parcel)
        }

        override fun newArray(size: Int): Array<ParcelableImplClass?> {
            return arrayOfNulls(size)
        }
    }

}


// Sending data
val objParcelable = ParcelableImplClass("Mike", 6)
val intent = Intent(this, NextActivity::class.java)
intent.putExtra("parcelable_key", objParcelable)
startActivity(intent)

// Receiving data
val student = intent.getParcelableExtra<ParcelableImplClass>("parcelable_key")
