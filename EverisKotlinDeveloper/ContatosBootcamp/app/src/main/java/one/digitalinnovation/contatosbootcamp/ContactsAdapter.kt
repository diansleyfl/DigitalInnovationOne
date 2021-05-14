package one.digitalinnovation.contatosbootcamp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class ContactsAdapter (val contactsList: ArrayList<Contact>) : RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_view, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return contactsList.size
    }


    override fun onBindViewHolder(holder: ContactsAdapter.ViewHolder, position: Int) {
        holder.bindItem(contactsList[position])
    }


    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItem(contact: Contact) {
            val textName = itemView.findViewById<TextView>(R.id.contact_nome)
            val textPhone = itemView.findViewById<TextView>(R.id.contact_telefone)

            textName.text = contact.name
            textPhone.text = contact.phoneNumber
        }
    }

}